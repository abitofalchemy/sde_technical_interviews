Hello!  Ready when you are:

boolean areWeRated(sal, vincent) { 
	List<E> salsAn = new List<E>();
	List<E> vincentsAn = new List<E>();
	salsAn = commonAncestorOf(sal);
      vincentsAn = commonAncestorOf(vincent);
      
	if ( compareCommonAncestors(salAn, vincentAn) ) return true;
else return false;
} 

public List<E>  commonAncestorOf(Person personObject) {
     Node root = personObject.root;
     Node father = personObject.father;
     Node mother = personObject.mother;

     List<E> ancestors = new List<>();
     return traverseTree(root, father, mother);  
	
}


