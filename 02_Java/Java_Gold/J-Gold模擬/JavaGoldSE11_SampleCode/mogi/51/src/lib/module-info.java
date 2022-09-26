module lib {
  exports com.seshop;
  exports com.seshop.impl;
  provides com.seshop.BookInfo with 
           com.seshop.impl.TeckBookInfo,
           com.seshop.impl.CookBookInfo;
}
