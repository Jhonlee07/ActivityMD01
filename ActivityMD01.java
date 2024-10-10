public class ActivityMD01{
    public static void main (String[]args){
        char [][] array = new char[3][4];

        for (int i = 0; i < array.length; i++)
        {
            for(int l = 0; l < array[i].length; l++)
            {
                array[i][l] = '*';
            }

        }

        for (int i = 0; i < array.length; i++)
        {
            for(int l = 0; l < array[i].length; l++)
            {
              System.out.print(array[i][l] + " ");
            }
            System.out.println();
        }
    }
}