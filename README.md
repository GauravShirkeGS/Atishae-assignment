# Atishae Assignment

This is a SpringBoot project that implements two endpoints for creating a graph with nodes and checking connections between them. It consist of Service layer, controller and global exception handler. And having unit test for the service layer.

## Introduction

The purpose of this project is to provide functionality to create a graph by adding nodes to it and to determine whether there is a connection between two given nodes. The project includes two main mapping methods and associated endpoints.

## Mapping Methods

1. **POST Mapping Method to Join Nodes**

   Endpoint: `/atishae/{Integer}/{Integer}`
   
   This method allows you to join two nodes in the graph. Replace `{Integer}` with the IDs of the nodes you want to join.

2. **GET Mapping Method to Check Node Connection**

   Endpoint: `/atishae/{Integer}/{Integer}`
   
   This method returns a boolean value indicating whether two given nodes are connected in the graph. Replace `{Integer}` with the IDs of the nodes you want to check for a connection.

## Endpoints

1. **POST Mapping - Join Nodes**

   Endpoint: `/atishae/{Integer}/{Integer}`
   
   Example: `POST /atishae/1/2`
   
   This endpoint allows you to join two nodes in the graph by specifying their IDs in the URL. For example, the above request would join node 1 and node 2.

2. **GET Mapping - Check Node Connection**

   Endpoint: `/atishae/{Integer}/{Integer}`
   
   Example: `GET /atishae/1/3`
   
   This endpoint returns a boolean value indicating whether there is a connection between the two specified nodes. For example, the above request would return a boolean value.

## Methods

1. `joinNode` Method

   This method is responsible for joining two nodes in the service layer.

2. `isConnected` Method

   This method checks whether there is a connection between two nodes and returns a boolean value accordingly.

## Examples

- Example 1:

  ```java
  joinNode(1, 2);
  joinNode(2, 3);
  boolean result = isConnected(1, 3); // This should return true
  joinNode(1, 3);
  joinNode(2, 3);
  joinNode(7, 8);
  boolean result = isConnected(1, 7); // This should return false

