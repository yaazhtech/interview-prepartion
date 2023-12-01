package com.yaazhtech.training.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcepts {
//org -> n person
   // pancard-> personDetails
    // String-> pojo
// removing employee is

// put// get// contains
    public Map<Employee,Integer> constructMap(int n){ //50
        Map<Employee,Integer> mapObj=new HashMap<>();
        Map<String,Integer> map=new HashMap<>();
        String key1="myKey";// hashCode,objectValue
        String key2="myKey";// hashCode,objectValue
        System.out.println("hasCode"+key1.equals(key2));
        Integer a=10;// hashCode,objectValue
// kanarasu
//hashcode pancardNo-hosahcode-38,100 changed the hashcode by mistake //
        //get pancarNo?
        // pancardNo 38
        // get
        // Key, values
// array bucket 16 (0 to 15) // 0.75 //
       /* 0 - linkendlist1
                1 - linkendlist2 // redblocktree
                6 - linkedList //
                4 - linkedList // flase null
                        ...... 15 - linkednlist15 ---- 200
                        */
// equals   pancardNo  -"abca23sf"

       //linkednlist15 whether this is key exist or not? pancardNo.equals(linkednlist15.get(i).panCardNo)
        // if exist overrize
        //else insert
        // linked
        map.get(key,value); //return null // return entrySet<Key,Value>
        for(int i=0;i<n;i++){
            Employee e=new Employee();
            e.setName("name"+i);
            e.setPan("pan"+i);
            e.setPassWord("password"+i);
            mapObj.put(e,i);//
            // map.put(pancardNo,personInfo);
            //map.put(pancardNo,personInfo);
            // 1. jvm will get the key's hashcode=16 and hashcode%16=95%16=r=0,c=6 (0..15)
            System.out.println("hasCode: e"+i+": "+e.hashCode());
            System.out.println("employee object value: e"+i+": "+e.toString());
        }

        return mapObj;
 /*1. Key and value pair
     Internal impl:
     Bucket - 0 - 15
     0=LinkedList<EntrySet>,1=LinkedList<EntrySet>,2=LinkedList<EntrySet>...... 15=LinkedList<EntrySet>
     hashcode and equals contract

     if i change the hashcode or equals logic what will happen? collison

Every object has their own hashcode
*
*/
        /* hashcode is used to identify the bucked using module operator , equals method
        // how many object will be in hasp? suneel -5, venu - 1 (it will replace the value) when key is same it will override?
 ///    1. It will identify the hashcode of give key. (suneel - hashcode)
        2. Based on hashode it has to identify the bucket. [ 0 to 15 bucket of array as per initial size 16 and each bucket has individual linkedlist to save the entry set]
        3. hashcode%by_initial_size    19%16 = 3 [% it will return remaining], 105%16=, 84%16=4, 78%16=14, 67%16=,90%16=10, 78%16=14,36%16=4
        //equals
        4. It will check whether key exist or not by using equals method.
        5. suneel.equals (itetrate the entrySet of the bucket from identified buckets list and then compare the keys using equals method to identify)
        6. If (key Exist){override the entryset in linkedlist with latest key value pair}
        else { create new entryset and save it
        }
get

6. if(key exist) it will return the entrySet (key value) else { return null;}

containsKey
7. if(key exist) return true else false;

 */

    }
}
