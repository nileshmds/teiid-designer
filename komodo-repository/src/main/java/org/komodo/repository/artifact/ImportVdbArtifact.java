/*
 * JBoss, Home of Professional Open Source.
*
* See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
*
* See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
*/
package org.komodo.repository.artifact;

/**
 * An entry artifact.
 */
public class ImportVdbArtifact implements Artifact {

    /**
     * The S-RAMP artifact type for a VDB entry.
     */
    public static final Type TYPE = new Type() {

        /**
         * {@inheritDoc}
         *
         * @see org.komodo.repository.artifact.Artifact.Type#getId()
         */
        @Override
        public String getId() {
            return "TeiidVdbEntry"; //$NON-NLS-1$
        }

    };

}
