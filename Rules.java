public static String checkWinner(){
    List toprow= Arrays.asList(1,2,3);
    List midrow= Arrays.asList(4,5,6);
    List botrow= Arrays.asList(7,8,9);
    List leftcol= Arrays.asList(1,4,7);
    List midcol= Arrays.asList(2,5,8);
    List rightcol= Arrays.asList(3,6,9);
    List cross1= Arrays.asList(1,5,9);
    List cross2= Arrays.asList(7,5,3);
    
    List<List> winning= new ArrayList<List>();
    winning.add(toprow);
    winning.add(midrow); 
    winning.add(botrow); 
    winning.add(leftcol); 
    winning.add(midcol); 
    winning.add(rightcol); 
    winning.add(cross1); 
    winning.add(cross2);
    
    for(List l:winning){
        if(playerPositions.containsAll(l)){
            return "Congratulations you won!";
        } else if(PCPositions.containsAll(l)){
            return "PC wins! Sorry :(";
        }else if(playerPositions.size()+PCPositions.size()==9){
            return "Check Mate!";
        }
    }
    return "";
}
