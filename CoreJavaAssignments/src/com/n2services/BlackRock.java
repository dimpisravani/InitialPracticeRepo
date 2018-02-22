package com.n2services;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.naming.ldap.SortControl;

public class BlackRock {
//String[] naames= {"Alex", "Harry", Michael, Mary};


//String array of names
//Name, Votes
//Max of votes
//Lets get the key of max votes and write


	//Map<String, Integer> total = new HashMap<String, Integer>();

	static String electionWinner(String[] votes){
		Map<String, Integer> totalMap = new HashMap<String, Integer>();
		//Iterate through string array
		//If the value of string array is not present in map, then 
		//add the value of string array as key to map and value as 1.
		//If the value of string array is already present in map,
		//then retrieve that value and add one to it.
		int voteCount =1;
		List<String> stringList = new ArrayList<String>();
		for(String eachString: votes){
			if(!totalMap.containsKey(eachString)){
				totalMap.put(eachString, voteCount);
			}
			else {
				voteCount=	totalMap.get(eachString)+1;
				totalMap.put(eachString, voteCount);
			}
		}
		int maxValueInMap=(Collections.max(totalMap.values()));  // This will return max value in the Hashmap
		for(Map.Entry<String, Integer> entry: totalMap.entrySet()){// Itrate through hashmap
			if (entry.getValue()==maxValueInMap) {
				String s= entry.getKey(); // Print the key with max value
				stringList.add(s);
			}
		}
	     Collections.sort(stringList);
	     
	     System.out.println(stringList.get(stringList.size()-1));
		
	
		
				
		
	
		
		return null;

	}
		
	public static void main (String args[]) {
		 String []arrayStr = 	{"Alex", "Harry", "Michael", "Mary", "face","face","Alex"};
		BlackRock.electionWinner(arrayStr);

		
	}



	
	
	
}
