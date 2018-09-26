public class ListAdd {

	public static class ListNode {
		Integer data;
		ListNode next;

		public ListNode(Integer data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		node1.next = node2;
		node3.next = node4;
		ListNode node = merge(node1, node3);
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	public static ListNode merge(ListNode node1, ListNode node2) {
		ListNode listNode = new ListNode(null);
		ListNode node = listNode;
		while (node1 != null && node2 != null) {
			if (node1.data < node2.data) {
				listNode.next = node1;
				node1 = node1.next;
			} else {
				listNode.next = node2;
				node2 = node2.next;
			}
			listNode = listNode.next;
		}
		if (node1 != null) {
			listNode.next = node1;
		} else {
			listNode.next = node2;
		}
		return node.next;
	}
}
