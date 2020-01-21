import java.io.Serializable;

class frame implements Serializable
{
    int id;
    String name;
    int protocol_id;

    frame(int id, String name,int protocol_id)
    {
        this.id = id;
        this.name = name;
        this.protocol_id = protocol_id;
    }

    void showDetails(){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Protocol Id:"+protocol_id);

    }
}