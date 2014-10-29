/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.resources.models;

import com.microsoft.windowsazure.core.LazyArrayList;
import com.microsoft.windowsazure.core.OperationResponse;
import java.util.ArrayList;

/**
* List of subscription tags.
*/
public class TagsListResult extends OperationResponse {
    private String nextLink;
    
    /**
    * Required. Gets or sets the URL to get the next set of results.
    * @return The NextLink value.
    */
    public String getNextLink() {
        return this.nextLink;
    }
    
    /**
    * Required. Gets or sets the URL to get the next set of results.
    * @param nextLinkValue The NextLink value.
    */
    public void setNextLink(final String nextLinkValue) {
        this.nextLink = nextLinkValue;
    }
    
    private ArrayList<TagDetails> tags;
    
    /**
    * Optional. Gets or sets the list of tags.
    * @return The Tags value.
    */
    public ArrayList<TagDetails> getTags() {
        return this.tags;
    }
    
    /**
    * Optional. Gets or sets the list of tags.
    * @param tagsValue The Tags value.
    */
    public void setTags(final ArrayList<TagDetails> tagsValue) {
        this.tags = tagsValue;
    }
    
    /**
    * Initializes a new instance of the TagsListResult class.
    *
    */
    public TagsListResult() {
        super();
        this.setTags(new LazyArrayList<TagDetails>());
    }
    
    /**
    * Initializes a new instance of the TagsListResult class with required
    * arguments.
    *
    */
    public TagsListResult(String nextLink) {
        this();
        if (nextLink == null) {
            throw new NullPointerException("nextLink");
        }
        this.setNextLink(nextLink);
    }
}
