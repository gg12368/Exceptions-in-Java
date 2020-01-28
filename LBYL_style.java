boolean ret = false; 
ret = 登陆游戏(); 
if (!ret) { 
  处理登陆游戏错误; 
  return; 
}
ret = 开始匹配(); 
if (!ret) { 
  处理匹配错误; 
  return; 
}
ret = 游戏确认(); 
if (!ret) { 
  处理游戏确认错误; 
  return; 
}
