public static void main(String[] args) {

    char[][] gameBoard = {
    {' ','|',' ','|',' '},
    {'-','+','-','+','-'},
    {' ','|',' ','|',' '},
    {'-','+','-','+','-'},
    {' ','|',' ','|',' '}
    };

    printGameBoard(gameBoard);
    while(true){
        Scanner sc = new Scanner(System.in);
        System.out.println("Play Your Move (1-9):");
        int playerPos = sc.nextInt();
        while(playerPositions.contains(playerPos)|| PCPositions.contains(playerPositions)){
            System.out.println("Position taken! Enter a correct Position");
        }
        placePiece(gameBoard,playerPos,"player");
        Random rd = new Random();
        int PCpos = rd.nextInt(9)+1;
        while(playerPositions.contains(PCpos)|| PCPositions.contains(PCpos)){
            System.out.println("Position taken! Enter a correct Position");
            PCpos = rd.nextInt(9)+1;
        }
        placePiece(gameBoard,PCpos,"PC");

        printGameBoard(gameBoard);
        result = checkWinner();
        if(result.length()>0){
            System.out.println(result);
            break;
        }            
    }   
}
