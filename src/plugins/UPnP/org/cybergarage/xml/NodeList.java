/******************************************************************
*
*   CyberXML for Java
*
*   Copyright (C) Satoshi Konno 2002
*
*   File: NodeList.java
*
*   Revision;
*
*   11/27/02
*       - first revision.
*
******************************************************************/


package plugins.UPnP.org.cybergarage.xml;

import java.util.*;

public class NodeList extends Vector {
    private static final long serialVersionUID = 1528884682346143213L;

    public NodeList() {}

    public Node getNode(int n) {
        return (Node) get(n);
    }

    public Node getNode(String name) {
        if (name == null) {
            return null;
        }

        int nLists = size();

        for (int n = 0; n < nLists; n++) {
            Node node = getNode(n);
            String nodeName = node.getName();

            if (name.compareTo(nodeName) == 0) {
                return node;
            }
        }

        return null;
    }

    public Node getEndsWith(String name) {
        if (name == null) {
            return null;
        }

        int nLists = size();

        for (int n = 0; n < nLists; n++) {
            Node node = getNode(n);
            String nodeName = node.getName();

            if (nodeName == null) {
                continue;
            }

            if (nodeName.endsWith(name) == true) {
                return node;
            }
        }

        return null;
    }
}
