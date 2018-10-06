package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * 1)What is Hibernate ?
 *   	hibernet is a ORM framework thats provide a abstraction layers on JDBC technology
 * 
 * 2)What is ORM Tool ?(Object Reletional Mapping)
 * 		ORM means object class convert into Table in DataBase
 *
 * 3)What is Dis-advantage of JDBC ?
 * 		1)we need to write a long code for connecting to database 
 * 		2)if we are missing to close database connection then Data Leakage problem may occur	
 * 		3)there  no concept like cache in jdbc
 * 		4)
 *
 * 4)what is the core Interface in Hibernate?
 * 		1)Configuration :-when App is start then its load the Xml file and read the meta-data about Application and create Sessionfactory Object 
 * 		
 * 		2)Sessionfactory :- Sessionfactory Object provide  Create Session and it contain the Level-2 Cache  enable default and you have to configure it , sessionfactory object is specific to whole Aplication
 * 		
 * 		3)Session	:- by using session is used to interact with database , in between are performing persistence operation on persistence data
 * 						it contain level-1 cahch   enabled by default and cannot be turned off.
 * 
 * 		4)Transaction:- generally we used Transaction to committing purpose if we are performing (Update Insert Delete) and insert operation on Database
 *  
 * 		
 * 		5)Query and criteria:-we used criteria to ftech record from datbase(here we don't need to write a query
 * 
 * 5)how many cfg.xml can we  creates in our Application?
 * 			it will depend on condition how many database we are creating generally cgf.xml file is create one per database
 * 
 * 6)what is dialect ?
 * 		dialect i used to create a database specific query
 * 
 * 7) what is DDL cammand?
 * 			DDL.auto perform 3 operation create ,update, validate
 * 
 * 
 * 8)how many hbm.xml can we  creates in Application?
 * 		its depend on condition how many tables we are creating generally 1 hbm.xml class creates per on table 
 * 		or we can create on Mapping file for multipal database but its not a good practice
 * 
 * 
 * 9)diff between load() and get()?
 * 			get():- when we call get() then internally it directly hets the database and fetch
 * 					 the record from table and store into session object.
 * 
 *			load():- when we call load() then internally it create proxy object and when we require a data from 
 *					  table that time it will hit to database and fetch the record from table
 *
 *
 * 10)diff bet lazy and early loading in HB?
 * 			early loading:-in which it will directly hitt to the database and fetch the record from table and store into object.
 * 			
 * 			lazy loading:- here it will create one proxy object and object contain only id. that we want some 
 * 							info that time it will hit to DB and get data from table
 * 
 * 
 * 11)diff between  save() and pesist()?
 * 			both are same and both method makes transient instance persistance.
 * 					 but diff is return type of persist() is void 
 * 						and		
 * 							return type of save() is serailizable object.
 * 
 * 		
 * 12)diff between openSession and CurentSession?
 * 			CurrentSession:- it creates new session if not exsist .
 * 			OpenSession:- it creates new session in any situation.
 * 
 * 
 * 13) State Of Object in Hibernet?
 * 		1)Trasneint State:- when our newly created pojo class bject is not associated with session object then we are at trasneint state.
 * 		2)Persistence state:- when our newly created pojo class object is assosiated with session object then we are persistence state.
 * 
 * ---->3)Detached state:- when our pojo class object is at persistence state and session object is closed then we are at detached state.
 * 
 * 
 * 14)what is HQL ?
 * 			its native form of SQL,
 * 			in SQL we are perfroming operation on database table 
 * 				like :- select * from <table-name>;
 * 			but in HQL 
 * 				we are performing operation on model class 
 * 				like :- select P product from Product P;
 * 
 * 		
 * Q)what is criteria ?
 * 			criteria is only for selecting data from database by using this we can fetch full record ,partial record is not possible with this
 * 				if you want to get partial data from database so use projection with criteria
 * 
 * 			exp:-criteria  crit=session.createCriteria(Product.class);
 * 
 * 
 * 		exp:-	class Cat {
			    Owner owner; //referenced from Owner.id
			    String eyeColor;
			}
			
			class Owner {
			    List<Cat> catList;
			}
						
			Criteria criteria = getCurrentSession().createCriteria(cat.getClass(), "cat");
			criteria.createAlias("cat.owner", "owner");    
			criteria.add(Restrictions.eq("cat.eyeColor", "blue");
 * 			
 * 
 * Q)use projection in hibernet?
 * 			if we want to fetch partial data from databaseuse projection with criteria
 * 			
 * 			criteria  crit=session.createCriteria(Product.class);
 * 			projectionList p=projection.projectionList();
 * 				p.add(projections.property("product name");
 * 				p.add(projections.property("price");
 * 
 * 				crit.setProjection(p);
 * 
 * Q)criteria with condition?
 * 		gt() = greater than (>)
 * 		ge() = greater than equal to (>=)
 * 		lt()  = less than (<)
 * 		le() = less than equal (<=) 
 * 		eq() = equals to
 * 		
 * 		criteria  crit=session.createCriteria(Product.class);
 * 		criteria  cn=Restriction.gt("price",new double(20000));	
 * 			crit=add(cn);
 * 		cirt=add(order.asc("price"));	
 * 
 * Q) what is native-SQL query?---------------(here we can write JDBC(SQL) code)----------------
 * 		its an another way to performing bulk opreation on database.
 * 		by using this we can perfrom both query and N-query opreation.
 * 			
 * 		while perfroming Select Opreation with we need to type cast into array  if we want to type cast with our  
 * 		
 * 			SQLQuery query=session.createSQLQuery("select * from product").addEntity(Product.class);
 * 		
 * 
 * Q)What is Named SQL query?
 * 		while executing  HQL if we want execute same query multipal time that we can use Named-SQL query
 * 
 *			// in pojo class Employee.java
 * 			@NamedQueries({ @NamedQuery( name = "findEmployeeByName",query = "from Employee e where e.name = :name")})  
 * 			
 * 			//Test.java
 * 			ypedQuery query = session.getNamedQuery("findEmployeeByName");    
            query.setParameter("name","amit");   
                    
            List<Employee> employees=query.getResultList();   
 * 
 * Q)what is generators ?
 * 			whil saving object into DB generators is inform to container how primary-key vaue generate for new record 
 * 		there are 8 types of generators are:-
 * 		
 * 		1)assigned :-it we use assigned then programmer is responcible to assign primary key value to object(if we not config any generator that time its by default )
 * 		
 * 		2)increament:-here thiis generator used  i+1 formula for new record
 *   
 *		3)sequence:-(Not has the support with MySql)
 *			while inserting a new record in a database, hibernate gets next value from the sequence under assigns that value for the new record
 *		
 *		4)identity:-(its not working in oracle)
 *			this generator is similar to increment generator
 *
 *		5)hilo:-
			This generator is database independent
			for the first record, the id value will be inserted as 1
			for the second record the id value will be inserted as 32768
			
		6)native
			when we use this generator class, it first checks whether the database supports identity or not, if not checks for sequence and if not, then hilo will be used finally the order will be..

				identity
				sequence
				hilo	
				
		7)foreign:-	
 *
 *Inheritance Mapping:-
 *		if we have  super class and sub class and  if we save the sub-class obj then super class object will also store into Database
 *		
 *	1)Table / class Hierarchy:-
 *					if we havee a sub-class like crredit-card anf cheque
 *						then 
 *					then super-class payment will also saved into database.
				(here we need to add one extra cloumn in db to identify which class is updated the superclass)
				
	2)table /sub-class:-
						here if we save creditcard class object then 
									first HB will save data releted super-class obj into DB 
										and
									and then save credit card obj data in Creditcard Table in DB
									(so here super-class obj will save first)
									
	3)table/Concrete-class:-
					Something like previous example but the changes are at mapping file only, and one more thing is..
					x number of derived classes = x number of tables in the database
					
					Once we save the derived class object, then derived class data
					 and base class data will be saved in the derived class related table in the database
	
			
 */
public class createStudent 
{
    public static void main( String[] args )
    {
       Configuration cfg=new Configuration();
       cfg.configure("com/hibernate/hibernate-cfg.xml");
       SessionFactory sf=cfg.buildSessionFactory();
       Session session =sf.openSession();
       
      
    	   Student s=new Student();
           
           s.setId(101);
           s.setName("bml");
           
           Transaction tx=session.beginTransaction();
           session.save(s);
           tx.commit();
           session.close();
       
       
       
    }
}
