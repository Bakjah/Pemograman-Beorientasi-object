import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class AuthException extends Exception {
    private final int statusCode;

    public AuthException(String message, int statusCode) {
        super(message);
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
}

class BadRequestException extends AuthException {
    public BadRequestException(String message) {
        super(message, 400);
    }
}

class UnauthorizedException extends AuthException {
    public UnauthorizedException(String message) {
        super(message, 401);
    }
}

class NotFoundException extends AuthException {
    public NotFoundException(String message) {
        super(message, 404);
    }
}

class ConflictException extends AuthException {
    public ConflictException(String message) {
        super(message, 409);
    }
}

class User {
    private final String email;
    private final String fullname;
    private final String password;

    public User(String email, String fullname, String password) {
        this.email = email;
        this.fullname = fullname;
        this.password = password;
    }

    public String getEmail() 
    { 
        return email; 
    }
    public String getFullname() {
        return fullname; 
    }
    public boolean checkPassword(String input) {
        return password.equals(input); 
    }
}

class AuthService {
    private final Map<String, User> users = new HashMap<>();
    private User currentUser = null;

    public void register(String email, String fullname, String password)
            throws AuthException {
        if (currentUser != null) {
            throw new UnauthorizedException("Anda sudah login, silakan logout terlebih dahulu!");
        }
        if (password.length() < 8) {
            throw new BadRequestException("Password kur1ang dari 8 karakter!");
        }
        if (users.containsKey(email)) {
            throw new ConflictException("Email " + email + " sudah digunakan!");
        }
        users.put(email, new User(email, fullname, password));
        System.out.println("Register berhasil!");
    }

    public void login(String email, String password) throws AuthException {
        User user = users.get(email);
        if (user == null) {
            throw new NotFoundException("Email tidak ditemukan!");
        }
        if (!user.checkPassword(password)) {
            throw new UnauthorizedException("Password salah!");
        }
        currentUser = user;
        System.out.println("Login berhasil");
    }

    public void profile() throws AuthException {
        if (currentUser == null) {
            throw new UnauthorizedException("Anda harus login terlebih dahulu!");
        }
        System.out.println("=== Profil ===");
        System.out.println("Email    : " + currentUser.getEmail());
        System.out.println("Fullname : " + currentUser.getFullname());
    }

    public void logout() throws AuthException {
        if (currentUser == null) {
            throw new UnauthorizedException("Anda belum login!");
        }
        currentUser = null;
        System.out.println("Logout berhasil");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AuthService auth = new AuthService();
        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Lihat Profil");
            System.out.println("4. Logout");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu : ");
            String pilihan = scanner.nextLine().trim();

            try {
                switch (pilihan) {
                    case "1": {
                        System.out.print("Masukan email : ");
                        String email = scanner.nextLine().trim();
                        System.out.print("Masukan fullname : ");
                        String fullname = scanner.nextLine().trim();
                        System.out.print("Masukan password : ");
                        String password = scanner.nextLine();
                        auth.register(email, fullname, password);
                        break;
                    }
                    case "2": {
                        System.out.print("Masukan email : ");
                        String email = scanner.nextLine().trim();
                        System.out.print("Masukan password : ");
                        String password = scanner.nextLine();
                        auth.login(email, password);
                        break;
                    }
                    case "3":
                        auth.profile();
                        break;
                    case "4":
                        auth.logout();
                        break;
                    case "5":
                        running = false;
                        System.out.println("Program selesai.");
                        break;
                    default:
                        System.out.println("Menu tidak valid!");
                }
            } catch (BadRequestException | ConflictException
                     | NotFoundException | UnauthorizedException e) {
                System.out.println(e.getMessage());
            } catch (AuthException e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
            }
        }
        scanner.close();
    }
}