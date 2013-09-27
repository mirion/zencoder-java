/**
 * Copyright (C) 2013 Bitzeche GmbH <info@bitzeche.de>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.bitzeche.video.transcoding.zencoder.job;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import de.bitzeche.video.transcoding.zencoder.enums.ZencoderS3AccessControlRight;

public class ZencoderSegmentedStream
{
  private String path;
  private int bandwidth;

  public ZencoderSegmentedStream( String path, int bandwidth )
  {
    this.path = path;
    this.bandwidth = bandwidth;
  }

  /**
   * @return the path
   */
  public String getPath()
  {
    return path;
  }

  /**
   * @param path the path to set
   */
  public void setPath( String path )
  {
    this.path = path;
  }

  /**
   * @return the bandwidth
   */
  public int getBandwidth()
  {
    return bandwidth;
  }

  /**
   * @param bitrate the bandwidth to set
   */
  public void setBandwidth( int bandwidth )
  {
    this.bandwidth = bandwidth;
  }

  public Element createXML(Document document) {
    Element root = document.createElement("stream");

    Node bandwidthNode = document.createElement("bandwidth");
    bandwidthNode.setTextContent(""+this.bandwidth);
    root.appendChild(bandwidthNode);
    Element pathNode = document.createElement("path");
    pathNode.setTextContent(this.path);
    root.appendChild(pathNode);
    return root;
  }

}
