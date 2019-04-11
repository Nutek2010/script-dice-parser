/*
 * This software Copyright by the RPTools.net development team, and
 * licensed under the Affero GPL Version 3 or, at your option, any later
 * version.
 *
 * RPTools Source Code is distributed in the hope that it will be
 * useful, but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * You should have received a copy of the GNU Affero General Public
 * License * along with this source Code.  If not, please visit
 * <http://www.gnu.org/licenses/> and specifically the Affero license
 * text at <http://www.gnu.org/licenses/agpl.html>.
 */
package net.rptools.mtscript.ast;

import java.util.Map;

public class MethodDeclarationNode extends DeclarationNode {

  private final String name;
  private final Map<String, String> parameters; // If we do make type an
  // enum, we'll need to
  // update this.
  private final ASTNode body;

  MethodDeclarationNode(String name, Map<String, String> parameters, ASTNode body) {
    this.name = name;
    this.parameters = parameters;
    this.body = body;
  }

  public String getName() {
    return name;
  }

  public Map<String, String> getParameters() {
    return parameters;
  }

  public ASTNode getBody() {
    return body;
  }
}
