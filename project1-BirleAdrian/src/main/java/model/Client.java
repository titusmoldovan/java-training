package model;

import business.BaseProduct;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Client implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private int age;
    private String address;
    private String city;
    private String email;
    public Client(int id){
        this.id = id;
    }

    public Client(int id, String name, int age, String address, String city, String email) throws IOException, ClassNotFoundException {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.city = city;
        this.email = email;
        SerializeClients(this);
    }

    public Client() {

    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
    public String getCity() {
        return city;
    }
    public String getEmail() {
        return email;
    }
    public void setId(int id){
        this.id = id;
    }
    public void SerializeClients(Client newC) throws IOException, ClassNotFoundException {
        List<Client> clientList = DeserializeClients();
        clientList.add(newC);
        FileOutputStream fileOut = new FileOutputStream("clients.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(clientList);
        out.close();
        fileOut.close();
        clientList.forEach(System.out::println);
    }
    public List<Client> DeserializeClients() throws IOException, ClassNotFoundException {
        File f = new File("clients.ser");
        List<Client> clientList = new ArrayList<>();
        if(f.exists()) {
            FileInputStream fileIn = new FileInputStream("clients.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            clientList = (List<Client>) in.readObject();
            in.close();
            fileIn.close();
        }
        return clientList;
    }
    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Client other = (Client) obj;
        if (name == null) {
            if (other.getName() != null)
                return false;
        } else if (!name.equals(other.getName()))
            return false;
        return true;
    }
    public int hashCode(){
        return (int) name.hashCode();
    }
}
