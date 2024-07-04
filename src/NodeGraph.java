import java.util.List;

public class NodeGraph<T> {
    private T user;
    private List<T>friends;

    
    public NodeGraph(T user, List<T> friends) {
        this.user = user;
        this.friends = friends;
    }

    public NodeGraph(T user){

    }
    public void addFriend(T friend){

    }
    public List<T> getFriends(){
        return friends;

    }
    public T getValue() {
        return user;
    }

}
