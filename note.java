异常处理流程

程序先执行 try 中的代码
如果 try 中的代码出现异常, 就会结束 try 中的代码, 看和 catch 中的异常类型是否匹配.
如果找到匹配的异常类型, 就会执行 catch 中的代码
如果没有找到匹配的异常类型, 就会将异常向上传递到上层调用者.
无论是否找到匹配的异常类型, finally 中的代码都会被执行到(在该方法结束之前执行).
如果上层调用者也没有处理的了异常, 就继续向上传递.
一直到 main 方法也没有合适的代码处理异常, 就会交给 JVM 来进行处理, 此时程序就会异常终止
