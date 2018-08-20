package com.ypw.linkedList;

/**
 * @ClassName MyLinkedList
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/8/9 10:16
 * @Version 1.0
 **/
public class MyLinkedList {
    private Node firstNode;
    private Node lastNode;
    private int size;

    public void add(Object obj) {
        Node n = new Node();
        if (firstNode == null) {
            n.setPrevious(null);
            n.setObj(obj);
            n.setNext(null);
            firstNode = n;
            lastNode = n;
        } else {
            n.setPrevious(lastNode);
            n.setNext(null);
            n.setObj(obj);
            lastNode.setNext(n);
            lastNode = n;
        }
        size++;
    }

    public int size() {
        return this.size;
    }

    public Node node(int index) {
        Node temp = null;
        if (firstNode != null) {
            temp = firstNode;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        }
        return temp;
    }

    public Object get(int index) {
        Node node = node(index);
        if (node != null) {
            return node.getObj();
        } else {
            return null;
        }
    }

    public Object get(Object object) {
        Node nodeTemp = null;
        if (firstNode != null) {
            nodeTemp = firstNode;
            for (int i = 0; i < size; i++) {
                if (nodeTemp.obj.equals(object)) {
                    return nodeTemp.getObj();
                } else {
                    nodeTemp = nodeTemp.next;
                }
            }
        }
        return null;
    }

}
