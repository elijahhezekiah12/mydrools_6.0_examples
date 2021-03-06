/*
 * Copyright 2011 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.examples.honestpolitician;


/**
 *  This is a simple  Politician Class that maintains 2 variables: name and 'honest' state.
*/

public class Politician {
    private String  name;
    private boolean honest;
    
    public Politician() {       // Empty constructor

    }

    public Politician(String name, boolean honest) { // Constructor w/Arguments.
        super();
        this.name = name;
        this.honest = honest;                       
    }

    public boolean isHonest() {
        return honest;
    }

    public void setHonest(boolean honest) {
        this.honest = honest;
    }

    public String getName() {
        return name;
    }
    
}// End Class Politician
