package StringModule;

/**
* StringModule/OperationsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from StringModule.idl
* Sunday, May 28, 2023 6:22:49 PM IST
*/

public final class OperationsHolder implements org.omg.CORBA.portable.Streamable
{
  public StringModule.Operations value = null;

  public OperationsHolder ()
  {
  }

  public OperationsHolder (StringModule.Operations initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = StringModule.OperationsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    StringModule.OperationsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return StringModule.OperationsHelper.type ();
  }

}
