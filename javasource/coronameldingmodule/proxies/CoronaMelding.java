// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package coronameldingmodule.proxies;

public class CoronaMelding
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject coronaMeldingMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "CoronaMeldingModule.CoronaMelding";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		MelderId("MelderId"),
		Klachten("Klachten"),
		LocatieInfectieOpgelopen("LocatieInfectieOpgelopen"),
		DatumEersteKlachten("DatumEersteKlachten");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public CoronaMelding(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "CoronaMeldingModule.CoronaMelding"));
	}

	protected CoronaMelding(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject coronaMeldingMendixObject)
	{
		if (coronaMeldingMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("CoronaMeldingModule.CoronaMelding", coronaMeldingMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a CoronaMeldingModule.CoronaMelding");

		this.coronaMeldingMendixObject = coronaMeldingMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'CoronaMelding.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static coronameldingmodule.proxies.CoronaMelding initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return coronameldingmodule.proxies.CoronaMelding.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static coronameldingmodule.proxies.CoronaMelding initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new coronameldingmodule.proxies.CoronaMelding(context, mendixObject);
	}

	public static coronameldingmodule.proxies.CoronaMelding load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return coronameldingmodule.proxies.CoronaMelding.initialize(context, mendixObject);
	}

	public static java.util.List<coronameldingmodule.proxies.CoronaMelding> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<coronameldingmodule.proxies.CoronaMelding> result = new java.util.ArrayList<coronameldingmodule.proxies.CoronaMelding>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//CoronaMeldingModule.CoronaMelding" + xpathConstraint))
			result.add(coronameldingmodule.proxies.CoronaMelding.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of MelderId
	 */
	public final java.lang.Long getMelderId()
	{
		return getMelderId(getContext());
	}

	/**
	 * @param context
	 * @return value of MelderId
	 */
	public final java.lang.Long getMelderId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.MelderId.toString());
	}

	/**
	 * Set value of MelderId
	 * @param melderid
	 */
	public final void setMelderId(java.lang.Long melderid)
	{
		setMelderId(getContext(), melderid);
	}

	/**
	 * Set value of MelderId
	 * @param context
	 * @param melderid
	 */
	public final void setMelderId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long melderid)
	{
		getMendixObject().setValue(context, MemberNames.MelderId.toString(), melderid);
	}

	/**
	 * @return value of Klachten
	 */
	public final java.lang.String getKlachten()
	{
		return getKlachten(getContext());
	}

	/**
	 * @param context
	 * @return value of Klachten
	 */
	public final java.lang.String getKlachten(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Klachten.toString());
	}

	/**
	 * Set value of Klachten
	 * @param klachten
	 */
	public final void setKlachten(java.lang.String klachten)
	{
		setKlachten(getContext(), klachten);
	}

	/**
	 * Set value of Klachten
	 * @param context
	 * @param klachten
	 */
	public final void setKlachten(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String klachten)
	{
		getMendixObject().setValue(context, MemberNames.Klachten.toString(), klachten);
	}

	/**
	 * @return value of LocatieInfectieOpgelopen
	 */
	public final java.lang.String getLocatieInfectieOpgelopen()
	{
		return getLocatieInfectieOpgelopen(getContext());
	}

	/**
	 * @param context
	 * @return value of LocatieInfectieOpgelopen
	 */
	public final java.lang.String getLocatieInfectieOpgelopen(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LocatieInfectieOpgelopen.toString());
	}

	/**
	 * Set value of LocatieInfectieOpgelopen
	 * @param locatieinfectieopgelopen
	 */
	public final void setLocatieInfectieOpgelopen(java.lang.String locatieinfectieopgelopen)
	{
		setLocatieInfectieOpgelopen(getContext(), locatieinfectieopgelopen);
	}

	/**
	 * Set value of LocatieInfectieOpgelopen
	 * @param context
	 * @param locatieinfectieopgelopen
	 */
	public final void setLocatieInfectieOpgelopen(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String locatieinfectieopgelopen)
	{
		getMendixObject().setValue(context, MemberNames.LocatieInfectieOpgelopen.toString(), locatieinfectieopgelopen);
	}

	/**
	 * @return value of DatumEersteKlachten
	 */
	public final java.util.Date getDatumEersteKlachten()
	{
		return getDatumEersteKlachten(getContext());
	}

	/**
	 * @param context
	 * @return value of DatumEersteKlachten
	 */
	public final java.util.Date getDatumEersteKlachten(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.DatumEersteKlachten.toString());
	}

	/**
	 * Set value of DatumEersteKlachten
	 * @param datumeersteklachten
	 */
	public final void setDatumEersteKlachten(java.util.Date datumeersteklachten)
	{
		setDatumEersteKlachten(getContext(), datumeersteklachten);
	}

	/**
	 * Set value of DatumEersteKlachten
	 * @param context
	 * @param datumeersteklachten
	 */
	public final void setDatumEersteKlachten(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date datumeersteklachten)
	{
		getMendixObject().setValue(context, MemberNames.DatumEersteKlachten.toString(), datumeersteklachten);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return coronaMeldingMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final coronameldingmodule.proxies.CoronaMelding that = (coronameldingmodule.proxies.CoronaMelding) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "CoronaMeldingModule.CoronaMelding";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
