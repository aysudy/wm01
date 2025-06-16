package ipass.util;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class service

{
	// ---( internal utility methods )---

	final static service _instance = new service();

	static service _newInstance() { return new service(); }

	static service _cast(Object o) { return (service)o; }

	// ---( server methods )---




	public static final void getPackageName (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getPackageName)>> ---
		// @sigtype java 3.5
		// [o] field:0:required packageName
		IDataCursor c = pipeline.getCursor();
		IDataUtil.put(c, "packageName", com.wm.app.b2b.server.Service.getPackageName());
		c.destroy();
		// --- <<IS-END>> ---

                
	}
}

