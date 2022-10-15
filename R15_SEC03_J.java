protected static final Digester webDigester = init();
 
protected Digester init() {
  Digester digester = createWebDigester();
  // Does not use the context Classloader at initialization
  digester.getParser();
  return digester;
}
