import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("#".repeat(100));
        Path path = Paths.get("test.out");
        Scanner scanner = new Scanner(Files.newBufferedReader(path));
        String str;
        while (scanner.hasNextLine()) {
            str = scanner.nextLine();
            System.out.println(str);
        }
        scanner.close();

        Demo01 d01 = new Demo01("Jack");
        Demo01 d02 = new Demo01("Tom");
        Demo01 d03 = new Demo01("Jenny");
        d01.addFriend(d02);
        d01.addFriend(d03);
        d03.addFriend(d02);

        System.out.println("#".repeat(50));
        System.out.println(d01);
        System.out.println("#".repeat(50));
        System.out.println(d02);
        System.out.println("#".repeat(50));
        System.out.println(d03);


        


    }

    private static class Demo01 {
        private String name;
        private List<Demo01> friends;

        public Demo01(String name) {
            this.name = name;
            friends = new ArrayList<Demo01>();
        }

        public boolean addFriend(Demo01 demo01) {
            if (friends.contains(demo01)) {
                return false;
            } else {
                friends.add(demo01);
                return true;
            }

        }

        

        public String getName() {
            return name;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            result = prime * result + ((friends == null) ? 0 : friends.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            // if (this == obj)
            //     return true;
            // if (obj == null)
            //     return false;
            // if (getClass() != obj.getClass())
            //     return false;
            // Demo01 other = (Demo01) obj;
            // if (name == null) {
            //     if (other.name != null)
            //         return false;
            // } else if (!name.equals(other.name))
            //     return false;
            // if (friends == null) {
            //     if (other.friends != null)
            //         return false;
            // } else if (!friends.equals(other.friends))
            //     return false;
            // return true;
            return name.equals(((Demo01) obj).getName());
        }

        @Override
        public String toString() {
            return "Demo01 [name=" + name + ", friends=" + friends + "]";
        }
        
        
    }
}
