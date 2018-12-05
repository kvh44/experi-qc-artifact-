package enums;

import static java.lang.System.out;

public enum Language {
	  //Objets directement construits
	  JAVA("Langage JAVA", "Eclipse"),
	  C ("Lanage C", "Code Block"),
	  CPlus ("Langage C++", "Visual studio"),
	  PHP ("Langage PHP", "PS Pad"),
	  PYTHON;
	
	  private String name = "";
	  private String editor = "";
	   
	  //Constructeur
	  Language(String name, String editor){
	    this.name = name;
	    this.editor = editor;
	  }
	  
	  Language(){

	  }
	   
	  public void getEditor(){
	    System.out.println("Editeur : " + editor);
	  }
	   
	  public String toString(){
	    return name;
	  }
	   
	  public static void main(String args[]){
		  Language l1 = Language.JAVA;
		  Language l2 = Language.PHP;
	      
	    l1.getEditor();
	    l2.getEditor();
	  }
	}