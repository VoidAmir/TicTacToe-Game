public static void placePiece(char[][] gameBoard,int pos, String user){
    char symbol = 'X';
    if(user.equals("plyaer")){
        symbol='X';
    }else if(user.equals("Pc")){
        symbol='O';
    }
    switch(pos){
        case 1:
             gameBoard [0] [0]='X';
             break;
        case 2:
             gameBoard [0] [2]='X';
             break;
        case 3:
             gameBoard [0] [4]='X';
             break;
        case 4:
             gameBoard [2] [0]='X';
             break;
        case 5:
             gameBoard [2] [2]='X';
             break;
        case 6:
             gameBoard [2] [4]='X';
             break;
        case 7:
             gameBoard [4] [0]='X';
             break;
        case 8:
             gameBoard [4] [2]='X';
             break;
        case 9:
             gameBoard [4] [4]='X';
             break;
        default:
             break;     
    }
}
