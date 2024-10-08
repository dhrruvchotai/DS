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
    if(root == NULL) return;

    inOrder(root -> left);
    printf("%d ",root->data);
    inOrder(root -> right);

}

void preOrder(Node* root){
    if(root == NULL) return;

    printf("%d ",root->data);
    preOrder(root -> left);
    preOrder(root -> right);

}

void postOrder(Node* root){
    if(root == NULL) return;

    postOrder(root -> left);
    postOrder(root -> right);
    printf("%d ",root->data);

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

int findMin(Node* root){
    int min = root->data;

    while(root->left != NULL){
        min = root->left->data;
        root = root->left;
    }

    return min; 
}

Node* delete(Node* root,int key){
    if(root == NULL) return NULL;

    if(key < root -> data){
        root -> left = delete(root->left,key);
    }
    else if(key > root -> data){
        root -> right = delete(root -> right,key);
    }
    else{

        if(root -> left == NULL && root->right == NULL){
            return NULL;
        }
        
        if(root->left == NULL){
            return root->right;
        }
        else if(root->right == NULL){
            return root->left;
        }

        root->data = findMin(root);
        root->right = delete(root->right,key);
    }
    return root;
}


int main(){

    int arr[] = {50, 23, 12, 9, 75, 99};
    int len = (sizeof(arr)/sizeof(arr[0]));
    Node* root = NULL;
    
    // printf("%p",root); //prints pointer of root if null then 0.

     for (int i = 0; i < len; i++) {
        root = insert(root, arr[i]);
    }

    printf("Before deleting element : \n");
    inOrder(root);
    printf("\n");

    int isFound = search(root,12);

    if(isFound){
        printf("Element found in BST.");
    }
    else{
        printf("Element is not in the BST.");
    }

    printf("\n");

    root = delete(root,50);
    printf("After deleting the elemt : \n");
    inOrder(root);
    return 0;
}