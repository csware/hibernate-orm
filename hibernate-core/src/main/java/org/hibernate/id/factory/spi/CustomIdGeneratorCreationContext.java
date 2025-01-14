/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.id.factory.spi;

import org.hibernate.Incubating;
import org.hibernate.id.factory.IdentifierGeneratorFactory;
import org.hibernate.mapping.RootClass;
import org.hibernate.tuple.GeneratorCreationContext;

@Incubating
public interface CustomIdGeneratorCreationContext extends GeneratorCreationContext {
	IdentifierGeneratorFactory getIdentifierGeneratorFactory();
	RootClass getRootClass();
}
