/* $This file is distributed under the terms of the license in /doc/license.txt$ */

package edu.cornell.mannlib.vitro.webapp.auth.identifier.factory;

import javax.servlet.ServletContext;

import edu.cornell.mannlib.vitro.webapp.auth.identifier.IdentifierBundleFactory;
import edu.cornell.mannlib.vitro.webapp.dao.IndividualDao;
import edu.cornell.mannlib.vitro.webapp.dao.UserAccountsDao;
import edu.cornell.mannlib.vitro.webapp.dao.WebappDaoFactory;

/**
 * Some fields and methods that are helpful to IdentifierBundleFactory classes.
 */
public abstract class BaseIdentifierBundleFactory implements
		IdentifierBundleFactory {
	protected final ServletContext ctx;
	protected final WebappDaoFactory wdf;
	protected final UserAccountsDao uaDao;
	protected final IndividualDao indDao;

	public BaseIdentifierBundleFactory(ServletContext ctx) {
		if (ctx == null) {
			throw new NullPointerException("ctx may not be null.");
		}
		this.ctx = ctx;

		Object wdfObject = ctx.getAttribute("webappDaoFactory");
		if (wdfObject instanceof WebappDaoFactory) {
			this.wdf = (WebappDaoFactory) wdfObject;
		} else {
			throw new IllegalStateException(
					"Didn't find a WebappDaoFactory in the context. Found '"
							+ wdfObject + "' instead.");
		}

		this.uaDao = wdf.getUserAccountsDao();
		this.indDao = wdf.getIndividualDao();
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " - " + hashCode();
	}

}
