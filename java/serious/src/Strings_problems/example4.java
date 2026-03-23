package Strings_problems;

public class example4 {
    
    public static void pr(String st)
    {
        char[] arr = st.toCharArray();
        char ch = ' ';
        int max = 0;

        for(int i = 0; i < arr.length; i++)
        {
            int count = 0;

            for(int j = 0; j < arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                }
            }

            if(count > max)
            {
                max = count;
                ch = arr[i];
            }
        }

        System.out.println("frequent char is: " + ch);
    }

    public static void main(String[] args) {
        pr("uddaya");
    }
}