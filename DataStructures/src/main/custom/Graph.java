package main.custom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class implements a basic directed graph. It provides static inner
 * classes for nodes and edges. Methods are concerned with adding nodes, adding
 * edges and retrieving or checking their existence.
 *
 * @author Markus Muhr (mmu@foryouandyourcustomers.com)
 */
public class Graph {

	private Map<String, Node> nodeMap = new HashMap<String, Node>();
	private Map<String, List<Edge>> sEdgeMap = new HashMap<String, List<Edge>>();
	private Map<String, List<String>> targetSourceMap = new HashMap<String, List<String>>();

	/**
	 * This method creates new node or throw an exception if it already exist
	 *
	 * @param nodeId
	 *            unique identifier
	 * @return new node or exception
	 */
	public Node addNode(final String nodeId) {
		// TODO: implement
		if (nodeMap.containsKey(nodeId)) {
			throw new IllegalArgumentException();
		}
		Node newNode = new Node(nodeId);
		nodeMap.put(nodeId, newNode);
		sEdgeMap.put(nodeId, new ArrayList<Edge>());
		return newNode;
	}

	/**
	 * This method creates new edge or throw an exception if it already exist
	 *
	 * @param sourceNode
	 *            node from which the edge starts
	 * @param targetNode
	 *            node to which the edge end
	 * @return new node or exception
	 */
	public Edge addEdge(final Node sourceNode, final Node targetNode) {
		// TODO: implement
		String sID = sourceNode.getId();
		if (!containsEdge(sourceNode, targetNode)) {
			Edge newEdge = new Edge(sourceNode, targetNode);
			addToTargetList(sID, targetNode.getId());
			sEdgeMap.get(sID).add(newEdge);
			return newEdge;
		}
		throw new IllegalArgumentException();
	}

	private void addToTargetList(String source, String target) {
		if (targetSourceMap.containsKey(target)) {
			targetSourceMap.get(target).add(source);
		} else {
			List<String> sList = new ArrayList<String>();
			sList.add(source);
			targetSourceMap.put(target, sList);
		}
	}

	/**
	 * This method checks if a node with this identifier exists.
	 *
	 * @param nodeId
	 *            unique identifier
	 * @return true, if it exists, otherwise false
	 */
	public boolean containsNode(final String nodeId) {
		// TODO: implement
		return nodeMap.containsKey(nodeId);
	}

	/**
	 * This method checks if a edge with the given values exists
	 *
	 * @param edge
	 *            directed edge between two nodes
	 * @return true, if it exists, otherwise false
	 */
	public boolean containsEdge(final Edge edge) {
		// TODO: implement
		// String sID = edge.getStart().getId();
		// String tID = edge.getEnd().getId();
		if (containsEdge(edge.getStart(), edge.getEnd())) {
			return true;
		}
		return false;
	}

	/**
	 * This method checks if a edge with the given values exists
	 *
	 * @param sourceNode
	 *            node from which the edge starts
	 * @param targetNode
	 *            node to which the edge end
	 * @return true, if it exists, otherwise false
	 */
	public boolean containsEdge(final Node sourceNode, final Node targetNode) {
		// TODO: implement
		String sID = sourceNode.getId();
		String tID = targetNode.getId();
		if (containsNode(sID) && containsNode(tID)) {
			if (targetSourceMap.containsKey(tID)) {
				List<String> sList = targetSourceMap.get(tID);
				for (String x : sList) {
					if (x.equals(sID)) {
						return true;
					}
				}
			}
			return false;
		}
		return false;
	}

	/**
	 * This method returns a collection of edges that have the given node as
	 * start node.
	 *
	 * @param sourceNode
	 *            node from which the edge starts
	 * @return all edges that start from the given node, an empty collection
	 *         otherwise
	 */
	public Collection<Edge> getEdgesWithSource(final Node sourceNode) {
		// TODO: implement
		return Collections.unmodifiableList(sEdgeMap.get(sourceNode.getId()));
	}

	/**
	 * This method returns a collection of edges that have the given node as end
	 * node.
	 *
	 * @param targetNode
	 *            node to which the edge end
	 * @return all nodes that end in the given node, an empty collection
	 *         otherwise
	 */
	public Collection<Edge> getEdgesWithTarget(final Node targetNode) {
		// TODO: implement
		List<Edge> edges = new ArrayList<Edge>();
		if (targetSourceMap.containsKey(targetNode.getId())) {
			List<String> sList = targetSourceMap.get(targetNode.getId());
			for (String x : sList) {
				List<Edge> allEdges = sEdgeMap.get(x);
				for (Edge edge : allEdges) {
					if (edge.getEnd().equals(targetNode)) {
						edges.add(edge);
					}
				}
			}
		}
		return Collections.unmodifiableList(edges);
	}

	/**
	 * @return string representation of the graph
	 */
	@Override
	public String toString() {
		// TODO: implement
		StringBuilder print = new StringBuilder();
		print.append("x ");
		for (String x : nodeMap.keySet()) {
			print.append(x + " ");
		}
		print.append("\r\n");
		for (String x : nodeMap.keySet()) {
			print.append(x + " ");
			for (String t : nodeMap.keySet()) {
				if (containsEdge(nodeMap.get(x), nodeMap.get(t))) {
					print.append("y ");
				} else {
					print.append("n ");
				}
			}
			print.append("\r\n");
		}
		return print.toString();
	}

	public static class Node {
		private final String id;

		public Node(final String id) {
			this.id = id;
		}

		public String getId() {
			return id;
		}
	}

	public static class Edge {
		private final Node start;
		private final Node end;

		public Edge(final Node start, final Node end) {
			this.start = start;
			this.end = end;
		}

		public Node getStart() {
			return start;
		}

		public Node getEnd() {
			return end;
		}
	}

//	public static void main(final String[] args) {
//		final Graph graph = new Graph();
//		final Node node1 = graph.addNode("1");
//		final Node node2 = graph.addNode("2");
//		final Node node3 = graph.addNode("3");
//
//		System.out.println(graph.containsNode("1"));
//		System.out.println(graph.containsNode("2"));
//		System.out.println(graph.containsNode("3"));
//		System.out.println(graph.containsNode("4"));
//
//		final Edge edge1 = graph.addEdge(node1, node3);
//		final Edge edge2 = graph.addEdge(node1, node2);
//
//		System.out.println(graph.containsEdge(edge1));
//		System.out.println(graph.containsEdge(edge2));
//		System.out.println(graph.containsEdge(node2, node3));
//
//		System.out.println(graph.getEdgesWithSource(node1).size());
//		System.out.println(graph.getEdgesWithSource(node2).size());
//		System.out.println(graph.getEdgesWithSource(node3).size());
//
//		System.out.println(graph.getEdgesWithTarget(node1).size());
//		System.out.println(graph.getEdgesWithTarget(node2).size());
//		System.out.println(graph.getEdgesWithTarget(node3).size());
//
//		System.out.println(graph);
//	}
}