//ShowHomeController.java
package com.nt.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShowHomeController {
  
  /*@RequestMapping("/home")
  public  String   showHomePage(Map<String,Object>  map) {
    System.out.println("ShowHomeController.showHomePage():: Shared Memory obj class name::"+map.getClass());
    //add  attributes (Model attributes) to Shared Memory
    map.put("attr1","Val1");
    map.put("attr2", "val2");
  //return  LVN
  return  "welcome";
  }
  */  
  
  /*   @RequestMapping("/home")
    public  String   showHomePage(Model    model) {
        System.out.println("ShowHomeController.showHomePage():: Shared Memory obj class name::"+model.getClass());
        //add  attributes (Model attributes) to Shared Memory
        model.addAttribute("attr1","Val1");
        model.addAttribute("attr2", "Val2");
      //return  LVN
      return  "welcome";
    }
  */   
  /*@RequestMapping("/home")
  public  String   showHomePage(ModelMap  map) {
      System.out.println("ShowHomeController.showHomePage():: Shared Memory obj class name::"+map.getClass());
      //add  attributes (Model attributes) to Shared Memory
      map.addAttribute("attr1","Val1");
      map.put("age",new Random().nextInt(99) );
    //return  LVN
    return  "welcome";
  }
  */
  
  /*@RequestMapping("/home")
  public  String   showHomePage(ExtendedModelMap  map) {
      System.out.println("ShowHomeController.showHomePage():: Shared Memory obj class name::"+map.getClass());
      //add  attributes (Model attributes) to Shared Memory
      map.put("attr1","Val1");
      map.put("age", new Random().nextInt(100));
    //return  LVN
    return  "welcome";
  }*/
  
  /* @RequestMapping("/home")
  public  String   showHomePage(BindingAwareModelMap map) {
      System.out.println("ShowHomeController.showHomePage():: Shared Memory obj class name::"+map.getClass());
      //add  attributes (Model attributes) to Shared Memory
      map.put("attr1","Val1");
      map.put("age", new Random().nextInt(100));
    //return  LVN
    return  "welcome";
  }
  */
  
  @RequestMapping("/home")
  public  ModelAndView     showHomePage() {
      //create SharedMemory Explicitly
       ModelAndView  mav=new ModelAndView();
        //add model attributes
       mav.addObject("attr1","val1");
       mav.addObject("age", new Random().nextInt(1000));
        //add LVN
       mav.setViewName("welcome");
       return mav;
  }
  /*@RequestMapping("/")
  public  String   showHomePage() {
    //return  LVN
    return  "welcome";
  }*/
}
