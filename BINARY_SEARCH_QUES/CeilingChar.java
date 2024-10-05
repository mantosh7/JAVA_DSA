package JAVA_DSA.BINARY_SEARCH_QUES;
import java.util.*;
public class CeilingChar {
    public static void main(String[] args) {
        char[] letters = {'a','b','c','d','e','f','g','h','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        // char[] letters = {'c','f','j'};
        // char[] letters = {'e','e','g','g'};
        // char[] letters={'x','x','x','x','x','y','y'};

        char target = 'b';
        char ans  = ceilingSearch(letters,target);
        System.out.println(ans);
    }

    static char ceilingSearch(char[] letters, char target)
    {
        int start=0,end=letters.length-1;
        int mid=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(letters[mid]<=target)
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return letters[start%letters.length];
    }
}




// my method
// package JAVA_DSA.BINARY_SEARCH_QUES;
// import java.util.*;
// public class CeilingChar {
//     public static void main(String[] args) {
//         // char[] letters = {'a','b','c','d','e','f','g','h','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
//         // char[] letters = {'c','f','j'};
//         char[] letters = {'e','e','g','g'};
//         // char[] letters={'x','x','x','x','x','y','y'};

//         char target = 'g';
//         char ans  = ceilingSearch(letters,target);
//         System.out.println(ans);
//     }

//     static char ceilingSearch(char[] letters, char target)
//     {
//         int start=0,end=letters.length-1;
//         int mid=0;
//         boolean flag=false;
//         while(start<=end)
//         {
//             mid=start+(end-start)/2;
//             if(letters[mid]==target)
//             {
//                 if(mid!=letters.length-1 && letters[mid+1]!=letters[mid])
//                 {
//                     return letters[mid+1];
//                 } 
//                 else if(mid!=letters.length-1){
//                     while(mid+1<=letters.length-1 && letters[mid+1]==letters[mid])
//                     {
//                         mid++;
//                     }
//                     if(mid+1>letters.length-1) return letters[0];
//                     return letters[mid+1];
//                 }
//                 return letters[0];
//             }
//             else if(letters[mid]<target)
//             {
//                 start=mid+1;
//             }
//             else {
//                 end=mid-1;
//                 flag=true;
//             }
//         }
//         if(flag==false)
//         {
//             return letters[0];
//         }

//         return letters[start];
//     }
// }