# KDTree Java Implementation

## KDTree

A KDTree is a binary search tree where K-Dimensional points in space (e.g. x,y,z) are stored in each node. 

### KDTree from 2Dsample.csv

![Tree](https://github.com/wiederin/KdTree/blob/7c19c659f7556509a474665528875f2f79519e44/img/KDTree.drawio)

Each non-leaf node in the tree divides the space into two parts (half-spaces). Each level or depth of the tree is aligned by one of the K-Dimensions (x,y or z etc), with the root starting at x followed by y and so on (looping through the dimensions continuously). A node at depth D will be A-aligned with A given by: A = D mod K (numbering the planes starting from 0 i.e. K-1). For an x-aligned node (root) the left subtree will contain all points whose coordinates in that plane are smaller than the root node. The right subtree will contain all points whose coordinates in that plane are greater or equal to that of the root node.

## KDTree Builder

Use KdTreeBuilder.java to build KDTrees from csv data in the csv folder.