package com.atishae.unitTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.atishae.service.ServiceImpl;

public class unitTests {


	    
	    @Test
	    void testIsConnectedConnectedNodes() {
	        ServiceImpl ser = new ServiceImpl();
	        ser.joinNode(1, 2);
	        ser.joinNode(2, 3);
	        ser.joinNode(3, 4);
	        ser.joinNode(4, 5);
	        
	        assertTrue(ser.isConnected(1, 5)); //it should return true
	    }
	    
	    @Test
	    void testIsConnectedDisconnectedNodes() {
	    	 ServiceImpl ser = new ServiceImpl();
	    	 ser.joinNode(1, 2);
	    	 ser.joinNode(2, 3);
	    	 ser.joinNode(4, 5);
	        
	        assertFalse(ser.isConnected(1, 5)); //it should return false
	    }
	    
	    @Test
	    void testIsConnectedSingleNode() {
	    	 ServiceImpl ser = new ServiceImpl();
	    	 ser.joinNode(1, 2);
	    	 ser.joinNode(2, 3);
	    	 ser.joinNode(3, 4);
	    	 ser.joinNode(4, 5);
	        
	        assertTrue(ser.isConnected(1, 1));  //it should return true
	    }
	    
	    @Test
	    void testIsConnectedNonexistentNode() {
	    	 ServiceImpl ser = new ServiceImpl();
	    	 ser.joinNode(1, 2);
	    	 ser.joinNode(2, 3);
	    	 ser.joinNode(3, 4);
	    	 ser.joinNode(4, 5);
	        
	        assertFalse(ser.isConnected(1, 6));  //it should return false
	    }
	}


