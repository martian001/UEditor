package com.martian.ueditor.util;

/**
 * ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★<br>
 * ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★<br>
 * ★☆ @author： liangyanjun <br>
 * ★☆ @time：2015年10月8日上午11:04:05 <br>
 * ★☆ @version： <br>
 * ★☆ @lastMotifyTime： <br>
 * ★☆ @ClassAnnotation： <br>
 * ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★<br>
 * ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★<br>
 */
public class FileUtil {
   public static boolean saveFile(FileBean fileBean) {

      return false;
   }

   class FileBean {
      String name;
      String path;
      String content;
      String Character;

      public String getName() {
         return name;
      }

      public void setName(String name) {
         this.name = name;
      }

      public String getPath() {
         return path;
      }

      public void setPath(String path) {
         this.path = path;
      }

      public String getContent() {
         return content;
      }

      public void setContent(String content) {
         this.content = content;
      }

      public String getCharacter() {
         return Character;
      }

      public void setCharacter(String character) {
         Character = character;
      }

      @Override
      public int hashCode() {
         final int prime = 31;
         int result = 1;
         result = prime * result + getOuterType().hashCode();
         result = prime * result + ((Character == null) ? 0 : Character.hashCode());
         result = prime * result + ((content == null) ? 0 : content.hashCode());
         result = prime * result + ((name == null) ? 0 : name.hashCode());
         result = prime * result + ((path == null) ? 0 : path.hashCode());
         return result;
      }

      @Override
      public boolean equals(Object obj) {
         if (this == obj)
            return true;
         if (obj == null)
            return false;
         if (getClass() != obj.getClass())
            return false;
         FileBean other = (FileBean) obj;
         if (!getOuterType().equals(other.getOuterType()))
            return false;
         if (Character == null) {
            if (other.Character != null)
               return false;
         } else if (!Character.equals(other.Character))
            return false;
         if (content == null) {
            if (other.content != null)
               return false;
         } else if (!content.equals(other.content))
            return false;
         if (name == null) {
            if (other.name != null)
               return false;
         } else if (!name.equals(other.name))
            return false;
         if (path == null) {
            if (other.path != null)
               return false;
         } else if (!path.equals(other.path))
            return false;
         return true;
      }

      private FileUtil getOuterType() {
         return FileUtil.this;
      }

      @Override
      public String toString() {
         return "FileBean [name=" + name + ", path=" + path + ", content=" + content + ", Character=" + Character + "]";
      }

   }
}
