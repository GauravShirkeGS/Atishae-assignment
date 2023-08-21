package com.atishae.service;

import java.util.List;
import java.util.*;

import org.springframework.stereotype.Service;

import com.atishae.exception.atishaeException;

@Service
public class ServiceImpl implements com.atishae.service.Service {
	
	 public static Map<Integer, List<Integer>> adjacencyList;
	 
	 public ServiceImpl() {
		 adjacencyList = new HashMap<>();
	 }

	@Override
	public void joinNode(Integer a, Integer b)throws atishaeException {
		 adjacencyList.computeIfAbsent(a, k -> new ArrayList<>()).add(b);
//		 for undirected graph===>
	      adjacencyList.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
	      
	}

	@Override
	public Boolean isConnected(Integer a, Integer b) throws atishaeException {
		 Set<Integer> visited = new HashSet<>();
	        return checkConnection(a, b, visited);
	}

//   function for traverce over graph to check connectivity
	 private boolean checkConnection(int src, int dest, Set<Integer> visited) {
	        if (src == dest) {
	            return true;
	        }
	        visited.add(src);
	        for (int neighbor : adjacencyList.getOrDefault(src, new ArrayList<>())) {
	            if (!visited.contains(neighbor)) {
	                if (checkConnection(neighbor, dest, visited)) {
	                    return true;
	                }
	            }
	        }
	        return false;
	    }
	
}
