package main.custom;

import org.junit.Before;
import org.junit.Test;

import main.custom.Graph.Edge;
import main.custom.Graph.Node;

public class GraphTest {
	Graph graph;
	Node node1;
	Node node2;
	Node node3;

	Edge edge1;
	Edge edge2;

	@Before
	public void before() {
		graph = new Graph();
		
		node1 = graph.addNode("1");
		node2 = graph.addNode("2");
		node3 = graph.addNode("3");
		edge1 = graph.addEdge(node1, node3);
		edge2 = graph.addEdge(node1, node2);
	}
	@Test
	public void testContainsNode() {
		System.out.println(graph.containsNode("1"));
		System.out.println(graph.containsNode("2"));
		System.out.println(graph.containsNode("3"));
		System.out.println(graph.containsNode("4"));
	}

//	@Test
//	public void testAddEdge() {
//		edge1 = graph.addEdge(node1, node3);
//		edge2 = graph.addEdge(node1, node2);
//	}
//
	@Test
	public void testContainsEdge() {
		System.out.println(graph.containsEdge(edge1));
		System.out.println(graph.containsEdge(edge2));
		System.out.println(graph.containsEdge(node2, node3));
	}
//
	@Test
	public void testGetEdgeWithSource() {
		System.out.println(graph.getEdgesWithSource(node1).size());
		System.out.println(graph.getEdgesWithSource(node2).size());
		System.out.println(graph.getEdgesWithSource(node3).size());
	}
//
	@Test
	public void testGetEdgeWithTarget() {
		System.out.println(graph.getEdgesWithTarget(node1).size());
		System.out.println(graph.getEdgesWithTarget(node2).size());
		System.out.println(graph.getEdgesWithTarget(node3).size());
	}
//	
	@Test
	public void testPrintGraph() {
		System.out.println(graph);
	}

}
