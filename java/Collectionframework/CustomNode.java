package Collectionframework;

public class CustomNode
{
   Node head;
    class Node
    {

        String data;
        Node next;

        Node(String data)
        {
            this.data=data;
            this.next=null;

        }
    }
    public  void addf(String  data)
    {
        Node newNode=new Node( data);
        if(head==null)
        {
            head=newNode;
            newNode=head;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void lastE(String data)
    {

        Node newNode=new Node( data);
        if(head==null)
        {
            head=newNode;
            newNode=head;
            return;
        }
       Node CurrentNode=head;
        while (CurrentNode.next !=null) {
            CurrentNode = CurrentNode.next;
        }
        CurrentNode.next=newNode;

    }
        public  void printElement(String data)
        {
            Node CurrentNode=head;
            while (CurrentNode.next!=null){
                System.out.println(CurrentNode.data+" ");
            }


        }


    public static void main(String[] args)
    {
        CustomNode ob=new CustomNode();

        ob.addf("ok");
        ob.addf("s");
        ob.addf("smas");

    }

}



