package Collectionframework;
import java.io.*;



    // Serializable class
    class SerializationClass implements Serializable {
        private static final long serialVersionUID = 1L;
        private String name;
        private int age;

        // Constructor
        public SerializationClass(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getters
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        // Serialization method
        public void serialize(String filePath) throws IOException {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
                oos.writeObject(this);
                System.out.println("Object serialized and saved to " + filePath);
            }
        }

        // Deserialization method
        public static SerializationClass deserialize(String filePath) throws IOException, ClassNotFoundException {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
                SerializationClass obj = (SerializationClass) ois.readObject();
                System.out.println("Object deserialized from " + filePath);
                return obj;
            }
        }

        // Override toString for easy printing
        @Override
        public String toString() {
            return "SerializationClass{name='" + name + "', age=" + age + "}";
        }

        // Example usage
        public static void main(String[] args) {
            try {
                // Create an instance of the class
                SerializationClass obj = new SerializationClass("Alice", 30);

                // Serialize the object to a file
                obj.serialize("serialized_object.ser");

                // Deserialize the object from the file
                SerializationClass deserializedObj = SerializationClass.deserialize("serialized_object.ser");

                // Print the deserialized object
                System.out.println(deserializedObj);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }


