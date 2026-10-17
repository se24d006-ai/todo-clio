import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Todo CLI. Командууд: add, list, done, delete, exit");

        while (true) {
            System.out.print("> ");
            if (!scanner.hasNextLine()) {
                break;
            }
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) {
                continue;
            }

            String[] parts = line.split("\\s+", 2);
            String command = parts[0].toLowerCase();
            String arg = parts.length > 1 ? parts[1] : "";

            switch (command) {
                case "add":
                    if (arg.isEmpty()) {
                        System.out.println("Ажлын нэр оруулна уу. Жишээ: add Ном уншах");
                    } else {
                        manager.add(arg);
                    }
                    break;
                case "list":
                    manager.list();
                    break;
                case "done":
                    handleId(arg, manager, true);
                    break;
                case "delete":
                    handleId(arg, manager, false);
                    break;
                case "exit":
                    System.out.println("Баяртай!");
                    return;
                default:
                    System.out.println("Мэдэхгүй команд: " + command);
            }
        }
    }

    private static void handleId(String arg, TaskManager manager, boolean markDone) {
        try {
            int id = Integer.parseInt(arg);
            boolean ok = markDone ? manager.done(id) : manager.delete(id);
            if (!ok) {
                System.out.println("Ийм id-тай ажил олдсонгүй: " + id);
            }
        } catch (NumberFormatException e) {
            System.out.println("id нь тоо байх ёстой.");
        }
    }
}
