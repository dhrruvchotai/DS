#include<stdio.h>
#include<stdlib.h>

typedef struct Node
{
    int data;
    struct Node* left;
    struct Node* right;
}Node;

Node* createNode(int data){

    Node* newNode = (Node*)(malloc(sizeof(Node)));
    newNode -> data = data;
    newNode -> left = NULL;
    newNode -> right = NULL;
    return newNode;

}

Node* insert(Node* root,int val){

    if(root == NULL){
        return createNode(val);
    }

    if(val < root->data){
        root ->  left = insert(root->left,val);
    }
    if(val > root -> data){
        root -> right = insert(root -> right,val);
    }

    return root;
}

void inOrder(Node* root){
    if(root) return;

    inOrder(root -> left);
    printf("%d ",root->data);
    inOrder(root -> right);

}
int search(Node* root,int key){

    if(root == NULL) return 0;
    if(root->data == key) return 1;

    if(key < root->data){
        return search(root->left,key);
    }
    else if(key > root->data){
        return search(root->right,key);
    }
}

int main(){

    int arr[] = {50, 23, 12, 9, 75, 99};
    int len = (sizeof(arr)/sizeof(arr[0]));
    Node* root = NULL;
    printf("%p",root);

     for (int i = 0; i < len; i++) {
        root = insert(root, arr[i]);
    }


    inOrder(root);

    int isFound = search(root,12);

    if(isFound){
        printf("Element found in BST.");
    }
    else{
        printf("Element is not in the BST.");
    }

    return 0;
}