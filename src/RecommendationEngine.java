import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class RecommendationEngine<T> {
    public List<T> recommendFriends(NodeGraph<T> node,Graph<T> graph){
        List<T> recommendations = new ArrayList<>();
        for (NodeGraph<T> potentialFriendNode : graph.getNodes()){
            T potentialFriend = potentialFriendNode.getValue();
            if(!node.getFriends().contains(potentialFriend)&& !node.getValue().equals(potentialFriend)){
                if(!node.getFriends().contains(potentialFriend)&& !node.getValue().equals(potentialFriend)){
                    double similarity = calculateSimilarity(node.getValue(), potentialFriend);
                    if(similarity > 0.5){ //Umbral para recomendacion
                        recommendations.add(potentialFriend); 
                    }
                }
            }
        }  
        return recommendations;      
    }


    public double calculateSimilarity(T t, T potentialFriend){
       if(t instanceof User && potentialFriend instanceof User){
        User u1 = (User) t;
        User u2= (User) potentialFriend;
        Set<String> interests1 = new HashSet<>(u1.getInterests());
        Set<String> interests2 = new HashSet<>(u2.getInterests());
        Set<String> intersection = new HashSet<>(interests1);
        intersection.retainAll(interests2);
        Set<String> union = new HashSet<>(interests1);
        union.addAll(interests2);

        double resp = (double) intersection.size() / union.size();
        System.out.println("Valor- "+resp);
        
        return resp;

       } 
       return 0;
    }
    
}
