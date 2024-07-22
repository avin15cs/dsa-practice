package linkedList;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, linkedList.ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {

        return "[" + Stream.iterate(this, n -> n.next)
                .takeWhile(Objects::nonNull)
                .map(n -> String.valueOf(n.val))
                .collect(Collectors.joining(", ")) + "]";
    }
}
