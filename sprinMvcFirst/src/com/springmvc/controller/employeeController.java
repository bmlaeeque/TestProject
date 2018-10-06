package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.service.employeeService;

/**
 * 1) WHat is MVC? 
 * 	its a design pattern ,it provide the execution flow to a web
 * 	application 
 * 			M-->model() 
 * 			V-->view()
 * 		    C-->Controller() 
 * 2)why we use MVC Designpattern? 
 * 			we use MVC design pattern to reduce complexity in project
 *
 * 3)explain the Architecture of MVC? 
 * 	(a) When we are send request then first it
 * 		will come to Dispatcher servlet ,Then servlet Dispatcher forward that request
 * 		to Handler-Mapping Class (helper class)
 * 
 * 	(b) Then Handler-mapping class take this request and find the appropriate
 * 		Controller class And return the name of Controller class
 * 
 * 	(c)and the Dispacherservlet forword request to Controller class and controller class will process
 * 		the request by executing appropriate method and return the object of
 * 		mdelandView() to DS object contain view name + data(key ,value) pair new
 * 		ModelAndView(viewname, key,value);
 * 
 * (c)so DS forward that ModelAndView object
 * 		to View Resolver , and viewResolver find the appropriate viewname based on
 * 		modeandview() object contain view-page name and retun toDS (5)and DS pass
 * 		that model data to view page and view page response to browser
 * 
 * 
 * 4)What is Dispatcher Servlet??
 * 		Dispacher Servlet  acts a Controller it will manage the control-flow of web application
 * 		
 * 		DS internally uses IOC conatiner(xmlwebApplicationContext):- we don't need to config the xmlwebApplicationContext DS internally uses this container
 *		
 *5) how to config DS?
 *		we need to config DS in web.xml
 *		<web-app>
 *			<servlet>
 *			<servlet-name>Dispacher Servlet</servlet-name>
 *			<servlet-class>org.springframework.web.servlet.Dispacherservlet</servlet-class>
 *			</servlet>
 *			<servlet-mapping>
 *			<servlet-name>Dispacher servlet</servlet-name>
 *			<url-pattern>/</url-pattern>
 *			</servlet-mapping>
 *			</servlet>
 *		</web-app>
 * 6)what is handler mapping class ?(if we are not configuring handler mapping class then it will implicitly use BeanNameURlHandlermapping class)
 * 
 *			handler mapping class is responsible to find Controller class name based on URL and return that Controller class name to DS
 *
 *			type of predefine handler mapping class:-
 *			1)BeanNameURLHandlerMapping CLass:- here we can map URL with class
 *
 *					<beans >

					   <bean 
						class="org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping"/>
						
					   <bean name="/welcome.htm" 
					        class="com.mkyong.common.controller.WelcomeController" />
						
					   <bean name="/streetName.htm" 
					        class="com.mkyong.common.controller.StreetNameController" />
						
					   <bean name="/process*.htm" 
					        class="com.mkyong.common.controller.ProcessController" />
					        
					        
					 </beans>       

 *
 *			2)SimpleURLHandlerMapping class:- 	here we need to explicitly config the url with controller class like below
 *
 *						<beans>
 *						
						 <bean class="org.springframework.web.servlet.handler.SimpleUrlHandlerMapping">
							   <property name="mappings">
								<props>
								   <prop key="/welcome.htm">welcomeController</prop>            
								   <prop key="/helloGuest.htm">helloGuestController</prop>
								 </props>
							   </property>
							</bean>
						</beans>
 *
 *
 *
 *
 *			3)ControllerClassNameHandlerMapping:- here we no need to config just declare the controller class so when request come 
 *													to ControllerclassHandlermapping then it remove Controller from controller class name and 
 *													and change small letter and then compare with URL and if they match then return that class name to DS 
 *					
 *					<beans ...>

					  <bean 
					   class="org.springframework.web.servlet.mvc.support.ControllerClassNameHandlerMapping" />
						
					  <bean class="com.mkyong.common.controller.WelcomeController" />
						
					  <bean class="com.mkyong.common.controller.HelloGuestController" />
					
					</beans>
 *
 *
 *			4)DeoultAnnotationHandelmapping :-
 *
 *			5)configHandlerPriorityClass:-here we can define all three types of handler mapping type and assign priority to which execute first
 *					
 *				<beans>
 
					   <bean class="org.springframework.web.servlet.handler.SimpleUrlHandlerMapping">
					      <property name="mappings">
							<value>
								/index.htm=welcomeController
								/welcome.htm=welcomeController
								/main.htm=welcomeController
								/home.htm=welcomeController
							</value>
					      </property>
					      <property name="order" value="0" />   //here i m assigning to first priority 
					   </bean>
						
					   <bean class="org.springframework.web.servlet.mvc.support.ControllerClassNameHandlerMapping" >
					   
					      <property name="caseSensitive" value="true" />//and here i am tell to hnadeler mapping class if any letter is capital in URl then ignor it and do mapping with controller class
					      
					      <property name="order" value="1" />    //here i m assigning to first priority
					   </bean>	
						
					   <bean id="welcomeController" 
					      class="com.mkyong.common.controller.WelcomeController" />
							
					   <bean class="com.mkyong.common.controller.HelloGuestController" />
							
				</beans>
 *
 * 7)what is ControllerBean class?
 * 		it contain b.logic 
 * 		and it process the request by executing appropriate method and return the ModelAndView(viewName+ModelData) Object to ViewResolver
 * 		
 * 			(SpringMVC App have multipal ControllerBean class)
 * 			
 * 8)how many ways we can define the controller class?
 * 			1)extending by MultiController class
 * 					package com.mkyong.common.controller;

					import javax.servlet.http.HttpServletRequest;
					import javax.servlet.http.HttpServletResponse;
					import org.springframework.web.servlet.ModelAndView;
					import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
					
					public class CustomerController extends MultiActionController{
						
						public ModelAndView add(HttpServletRequest request,
							HttpServletResponse response) throws Exception {
							
							return new ModelAndView("CustomerPage", "msg","add() method");
								
						}
						
						public ModelAndView delete(HttpServletRequest request,
							HttpServletResponse response) throws Exception {
								
							return new ModelAndView("CustomerPage", "msg","delete() method");
									
						}
						
						public ModelAndView update(HttpServletRequest request,
							HttpServletResponse response) throws Exception {
								
							return new ModelAndView("CustomerPage", "msg","update() method");
									
						}
						
						public ModelAndView list(HttpServletRequest request,
							HttpServletResponse response) throws Exception {
									
							return new ModelAndView("CustomerPage", "msg","list() method");
										
						}
						
					}
					
					
					//////CopyWith ControllerClassNameHandlerMapping configured.
					
					<beans ...>
					
					 <bean 
					  class="org.springframework.web.servlet.mvc.support.ControllerClassNameHandlerMapping" />
					    
					  <bean class="com.mkyong.common.controller.CustomerController" />
						
					</beans>
 * 
 * 			2)by using Annotation:-
 * 					import javax.servlet.http.HttpServletRequest;
							import javax.servlet.http.HttpServletResponse;
							import org.springframework.stereotype.Controller;
							import org.springframework.web.bind.annotation.RequestMapping;
							import org.springframework.web.servlet.ModelAndView;
							
							@Controller
							public class CustomerController{
							 
								@RequestMapping("/customer/add.htm")
								public ModelAndView add(HttpServletRequest request,
									HttpServletResponse response) throws Exception {
							 
									return new ModelAndView("CustomerAddView");
							 
								}
							 
								@RequestMapping("/customer/delete.htm")
								public ModelAndView delete(HttpServletRequest request,
									HttpServletResponse response) throws Exception {
							 
									return new ModelAndView("CustomerDeleteView");
							 
								}
							 
								@RequestMapping("/customer/update.htm")
								public ModelAndView update(HttpServletRequest request,
									HttpServletResponse response) throws Exception {
							 
									return new ModelAndView("CustomerUpdateView");
							 
								}
							 
								@RequestMapping("/customer/list.htm")
								public ModelAndView list(HttpServletRequest request,
									HttpServletResponse response) throws Exception {
							 
									return new ModelAndView("CustomerListView");
							 
								}
							}
							Now, the URL will map to the method name in the following patterns :
							
							/customer/add.htm –> add() method
							/customer/delete.htm –> delete() method
							/customer/update.htm –> update() method
							/customer/list.htm –> list() method
 * 
 * 
 * 			3)PropertiesMethodNameResolver :-
 * 					import javax.servlet.http.HttpServletRequest;
					import javax.servlet.http.HttpServletResponse;
					import org.springframework.web.servlet.ModelAndView;
					import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
					
					public class CustomerController extends MultiActionController{
						
						public ModelAndView add(HttpServletRequest request,
							HttpServletResponse response) throws Exception {
							
							return new ModelAndView("CustomerPage", "msg","add() method");
								
						}
						
						public ModelAndView delete(HttpServletRequest request,
							HttpServletResponse response) throws Exception {
								
							return new ModelAndView("CustomerPage", "msg","delete() method");
									
						}
						
						public ModelAndView update(HttpServletRequest request,
							HttpServletResponse response) throws Exception {
								
							return new ModelAndView("CustomerPage", "msg","update() method");
									
						}
						
						public ModelAndView list(HttpServletRequest request,
							HttpServletResponse response) throws Exception {
									
							return new ModelAndView("CustomerPage", "msg","list() method");
										
						}
						
					}
					Copy
					
					 
					2. PropertiesMethodNameResolver
					With PropertiesMethodNameResolver, you can map whatever URL name to corresponds method name easily :
					
					<beans ...>
					
					 <bean 
					  class="org.springframework.web.servlet.mvc.support.ControllerClassNameHandlerMapping" />
					    
					 <bean class="com.mkyong.common.controller.CustomerController">
					   <property name="methodNameResolver">
					    <bean class="org.springframework.web.servlet.mvc.multiaction.PropertiesMethodNameResolver">
					      <property name="mappings">
						<props>
						   <prop key="/customer/a.htm">add</prop>
						   <prop key="/customer/b.htm">update</prop>
						   <prop key="/customer/c.htm">delete</prop>
						   <prop key="/customer/d.htm">list</prop>
						   <prop key="/customer/whatever.htm">add</prop>
						</props>
					       </property>
					     </bean>
					    </property>
					  </bean>
					
					</beans>
					Copy
					Now, the URL will map to the method name in the following pattern :
					
					/customer/a.htm –> add() method
					/customer/b.htm –> update() method
					/customer/c.htm –> delete() method
					/customer/d.htm –> list() method
					/customer/whatever.htm –> add() method
					 * 
			4)ParameterMethodNameResolver:-		
					import javax.servlet.http.HttpServletRequest;
					import javax.servlet.http.HttpServletResponse;
					import org.springframework.web.servlet.ModelAndView;
					import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
					
					public class CustomerController extends MultiActionController{
						
						public ModelAndView add(HttpServletRequest request,
							HttpServletResponse response) throws Exception {
							
							return new ModelAndView("CustomerPage", "msg","add() method");
								
						}
						
						public ModelAndView delete(HttpServletRequest request,
							HttpServletResponse response) throws Exception {
								
							return new ModelAndView("CustomerPage", "msg","delete() method");
									
						}
						
						public ModelAndView update(HttpServletRequest request,
							HttpServletResponse response) throws Exception {
								
							return new ModelAndView("CustomerPage", "msg","update() method");
									
						}
						
						public ModelAndView list(HttpServletRequest request,
							HttpServletResponse response) throws Exception {
									
							return new ModelAndView("CustomerPage", "msg","list() method");
										
						}
						
					}
					Copy
					
					 
					2. ParameterMethodNameResolver
					With ParameterMethodNameResolver configured, and define the parameter name thought the “paramName” property:
					
					<beans ...>
					
					 <bean 
					  class="org.springframework.web.servlet.mvc.support.ControllerClassNameHandlerMapping" />
					    
					  <bean class="com.mkyong.common.controller.CustomerController">
					     <property name="methodNameResolver">
						<bean class="org.springframework.web.servlet.mvc.multiaction.ParameterMethodNameResolver">
						   <property name="paramName" value="action"/>
						</bean>
					     </property>
					   </bean>
					
					</beans>
					Copy
					Now, the URL will map to the method name via the “action” request parameter name :
					
					/customer/*.htm?action=add –> add() method
					/customer/whatever.htm?action=add –> add() method
					/customer/*.htm?action=update –> update() method
					/customer/*.htm?action=delete –> delete() method
					/customer/*.htm?action=list –> list() method
					 * 
 * 			4)
 * 				In general, to return a view or page in Spring MVC application, you need to create a class, which extends the AbstractController , and return a ModelAndView() object.

					public class WelcomeController extends AbstractController{
						
						@Override
						protected ModelAndView handleRequestInternal(HttpServletRequest request,
							HttpServletResponse response) throws Exception {
					
							ModelAndView model = new ModelAndView("WelcomePage");
							return model;
							
						}
						
					}
					Copy
					In the bean configuration file, declared a ControllerClassNameHandlerMapping to auto detect the mapping.
					
					<bean 
					 class="org.springframework.web.servlet.mvc.support.ControllerClassNameHandlerMapping" />
						 
					<bean class="com.mkyong.common.controller.WelcomeController" />
					Copy
					But, don’t you think it’s too much configuration for a simple redirect task? Fortunately, Spring comes with ParameterizableViewController to simplify the above processes. With ParameterizableViewController, you don’t need to hard code the view name in the controller class anymore, instead, you put view name declarative through the ParameterizableViewController’s “viewName” property.
					
					Note
					The ParameterizableViewController is a subclass of AbstractController, and return a ModelAndView based on the “viewName” property, it’s purely a redirect class, nothing more, nothing less :)
					ParameterizableViewController.java
					
					public class ParameterizableViewController extends AbstractController{
					//...
					protected ModelAndView handleRequestInternal(
					    HttpServletRequest request, HttpServletResponse response)
						throws Exception {
					
						return new ModelAndView(getViewName());
					}
 *
 * 8)what is ModelAndView Object ?
 * 		 a object return by ControllerBean class is known as ModelAndView Object
 * 		
 * 			ModelAndView Object(viewName, model data);
 * 
 * 
 *
 * 9)what is ViewResolver?
 * 		its a helper class it return the view-name to DS based on ModelAndView(view-Name,modelData)
 * 		
 * 		types of ViewResolver:-
 * 		1)InernalResourceViewResolver:-Adding a predefined prefix and suffix to the view name (prefix + view name + suffix), and generate the final view page URL.
 * 					<bean id="viewResolver"
    	      class="org.springframework.web.servlet.view.InternalResourceViewResolver" >
              <property name="prefix">
                  <value>/WEB-INF/pages/</value>
               </property>
              <property name="suffix">
                 <value>.jsp</value>
              </property>
        </bean>
 * 
 * 
 * 		2)Configure multiple view resolvers priority:-
				If multiple view resolver strategies are applied, you have to declare priority to avoid conflict issue.
							<beans ...>
								<bean class="org.springframework.web.servlet.view.XmlViewResolver">
								      <property name="location">
								         <value>/WEB-INF/spring-views.xml</value>
								      </property>
								</bean>
							
								<bean class="org.springframework.web.servlet.view.ResourceBundleViewResolver">
								      <property name="basename" value="spring-views" />
								</bean>
								
								<bean id="viewResolver"
								      class="org.springframework.web.servlet.view.InternalResourceViewResolver" >
							              <property name="prefix">
							                 <value>/WEB-INF/pages/</value>
							              </property>
							              <property name="suffix">
							                 <value>.jsp</value>
							              </property>
							        </bean>
							</beans>
 * 		3)ResourceBundleViewResolver;-Puts view beans in “.properties” file
 * 				
 * 								//...
								public class WelcomeController extends AbstractController{
									
									@Override
									protected ModelAndView handleRequestInternal(HttpServletRequest request,
										HttpServletResponse response) throws Exception {
								
										ModelAndView model = new ModelAndView("WelcomePage");
										
										return model;
									}
								}
								Copy

 

					Register ResourceBundleViewResolver in the Spring’s bean configuration file, change the default view beans location to “spring-views.properties“.

					<beans xmlns="http://www.springframework.org/schema/beans"
						xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
						xsi:schemaLocation="http://www.springframework.org/schema/beans 
						http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">
					
					  <bean 
					  class="org.springframework.web.servlet.mvc.support.ControllerClassNameHandlerMapping" />
						
						<!-- Register the bean -->
						<bean class="com.mkyong.common.controller.WelcomeController" />
					
						<bean class="org.springframework.web.servlet.view.ResourceBundleViewResolver">
							<property name="basename" value="spring-views" />
						</bean>
					
					</beans>	
					
										spring-views.properties

								WelcomePage.(class)=org.springframework.web.servlet.view.JstlView
								WelcomePage.url=/WEB-INF/pages/WelcomePage.jsp
 * 
 * 		4)XmlViewresolver:-config the view  in XML file.(just like in autowiring property)
 * 		
 * 						<beans xmlns="http://www.springframework.org/schema/beans"
							xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
							xsi:schemaLocation="http://www.springframework.org/schema/beans 
							http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">

				   <bean 
				   class="org.springframework.web.servlet.mvc.support.ControllerClassNameHandlerMapping" />
					
					<!-- Register the bean -->
					<bean class="com.mkyong.common.controller.WelcomeController" />
				
					<bean class="org.springframework.web.servlet.view.XmlViewResolver">
					   <property name="location">
					       <value>/WEB-INF/spring-views.xml</value>
					   </property>
					</bean>

					</beans>		
 *
 */
@Controller
public class employeeController {
	@Autowired
	private employeeService employeeservice;

	public void setEmployeeservice(employeeService employeeservice) {
		this.employeeservice = employeeservice;
	}

	// @RequestMapping(value="/employee",method=RequestMethod.GET)
	@RequestMapping("/employee")
	public ModelAndView employee() {
		return new ModelAndView("employee", "emp", "bml");

	}

}
