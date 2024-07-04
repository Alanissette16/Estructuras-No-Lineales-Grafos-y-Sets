import java.util.List;

public class Graph<T> {
    private List<NodeGraph<T>> nodes;
    
    

    public Graph() {
    }

    public Graph(List<NodeGraph<T>> nodes) {
        this.nodes = nodes;
    }

    public List<NodeGraph<T>> getNodes() {
        return nodes;
    }
    public void setNodes(List<NodeGraph<T>> nodes) {
        this.nodes = nodes;
    }

    
    public void addNode(NodeGraph<T> node){

    }
    public void addConnection(NodeGraph<T> node1, NodeGraph<T> node2){

    }
    public List<T> getFriends(NodeGraph<T> node){
        return null;
        
    }
    public  List<T> recommendFriends(NodeGraph<T> node){
        return null;
    
    }

   

}
