package example;


/**
* example/FibonacciPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from D:/reposComputoDistribuido/Corba/CorbaFiboInterface/CorbaFiboInterface/src/fibonacci.idl
* mi�rcoles 21 de julio de 2021 01:00:34 AM CDT
*/

public abstract class FibonacciPOA extends org.omg.PortableServer.Servant
 implements example.FibonacciOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("generar", new java.lang.Integer (0));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {

  /*Codigo fibonacci CORBA
          *in: el valor del parametro se le envia al servidor
          *long: -231...231-1 (32bits)
          *numero: nombre de la variable
          */
       case 0:  // example/Fibonacci/generar
       {
         int numero = in.read_long ();
         String $result = null;
         $result = this.generar (numero);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:example/Fibonacci:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Fibonacci _this() 
  {
    return FibonacciHelper.narrow(
    super._this_object());
  }

  public Fibonacci _this(org.omg.CORBA.ORB orb) 
  {
    return FibonacciHelper.narrow(
    super._this_object(orb));
  }


} // class FibonacciPOA
