module lib {
  /* //A 
      exports com.seshop;
      provides com.seshop with com.seshop.impl;
 */
  
  /* //B
      exports com.seshop.impl;
      provides com.seshop with com.seshop.impl;
  */
  
  
    /* //C
      exports com.seshop.impl;
      provides BookInfo with TeckBookInfo,CookBookInfo;
  */
  
  /*  //D
      exports com.seshop.impl;
      provides com.seshop.BookInfo with 
               com.seshop.impl.TeckBookInfo,
               com.seshop.impl.CookBookInfo;
  */
  
   /*  //E
      exports com.seshop;
      exports com.seshop.impl;
      provides com.seshop.BookInfo with 
               com.seshop.impl.TeckBookInfo,
               com.seshop.impl.CookBookInfo;
  */
  
  
} 