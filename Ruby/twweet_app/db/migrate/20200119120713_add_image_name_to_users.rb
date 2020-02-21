class AddImageNameToUsers < ActiveRecord::Migration[6.0]
  def change
    add_column :users, :image_name, :string #テーブル名、　カラム名、　データ型
  end
end
