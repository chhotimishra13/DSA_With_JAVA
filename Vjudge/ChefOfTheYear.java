import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChefOfTheYear{
    public static void main(String[] args){
        Scanner s =  new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        HashMap<String,String>Country_chef = new HashMap<String,String>();
        HashMap<String,Integer>Country_votes = new HashMap<String,Integer>();
        HashMap<String,Integer>chef_votes = new HashMap<String,Integer>();

        for(int i=0; i<n; i++){
            String chef_name = s.next();
            String country_name = s.next();
            s.nextLine();
            Country_chef.put(chef_name,country_name);
            chef_votes.put(chef_name,0);
            Country_votes.put(country_name,0);
        }

        for(int i=0; i<m; i++){
            String chef_name = s.nextLine();
            chef_votes.put(chef_name,chef_votes.get(chef_name)+1);
            String country_name = Country_chef.get(chef_name);
            Country_votes.put(country_name,Country_votes.get(country_name)+1);
        }
        String winner_chef = null;
        int curr_max_votes = -1;
        for(Map.Entry<String,Integer> entry:chef_votes.entrySet()){
            String chef_name = entry.getKey();
            int num_of_votes = entry.getValue();
            if(num_of_votes > curr_max_votes || (num_of_votes == curr_max_votes && chef_name.compareTo(winner_chef) < 0)){
                curr_max_votes = num_of_votes;
                winner_chef = chef_name;
            }
        }
        String winner_country = null;
        curr_max_votes = -1;
        for(Map.Entry<String,Integer> entry:Country_votes.entrySet()){

            String country_name = entry.getKey();
            int num_of_votes = entry.getValue();
            if(num_of_votes > curr_max_votes || (num_of_votes == curr_max_votes && country_name.compareTo(winner_country) < 0)){
                curr_max_votes = num_of_votes;
                winner_country = country_name;
            }
        }
        System.out.println("The Winner Country is : " +winner_country);
        System.out.println("The Winner Chef is  : "+  winner_chef);
    }
}